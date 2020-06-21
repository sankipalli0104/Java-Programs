package com.apple.store.domain.offer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.apple.store.domain.offer.ShippingQuoteDisplayBehaviour;
import com.apple.store.domain.offer.configuration.CommitCodeBehaviour;
import com.apple.store.domain.offer.configuration.CommitCodeConfiguration;
import com.apple.store.domain.offer.configuration.CommitCodeConfigurationFactory;
import com.apple.store.domain.offer.impl.ShippingQuoteDisplayBehaviourImpl;
import com.apple.store.platform.model.renderers.product.CommitCodeUtil;
import com.apple.store.toolkit.config.ContextProvider;

public class CommitCodeUtilImpl implements CommitCodeUtil  {
    private final static Logger logger = LoggerFactory.getLogger(CommitCodeUtil.class);
    public ShippingQuoteDisplayBehaviour aosShippingQuoteDisplayFormatForCommitCode(final String commitCode) {
          return shippingQuoteDisplayFormatForCommitCode(commitCode, null, false);
      }
  
      public CommitCodeBehaviour getBehaviourForCommitCode(final String commitCode) {
          return CommitCodeConfigurationFactory.getCommitCodeConfiguration().getBehaviourForCommitCode(commitCode);
      }
  
      public CommitCodeBehaviour getBehaviourForUnbuyableProduct() {
          return getBehaviourForCommitCode("unbuyable");
      }
  
      protected static ShippingQuoteDisplayBehaviour shippingQuoteDisplayFormatForCommitCode(final String commitCode,
                                                                                             final ContextProvider context,
                                                                                             final boolean isSapQuote) {
          final CommitCodeConfiguration config = (context == null)
                  ? CommitCodeConfigurationFactory.getCommitCodeConfiguration()
                  : CommitCodeConfigurationFactory.getCommitCodeConfiguration(context);
  
          final CommitCodeBehaviour behaviourForCommitCode = config.getBehaviourForCommitCode(commitCode);
  
          if (behaviourForCommitCode == null) {
              return ShippingQuoteDisplayBehaviourImpl.DEFAULT_AOS_QUOTE_BEHAVIOUR;
          }
  
          // Create a mutable bean with the default behaviour
          final ShippingQuoteDisplayBehaviourImpl behaviour = new ShippingQuoteDisplayBehaviourImpl();
  
          // Override the default behaviour to that appropriate for an AOS quote with the specified
          // CommitCodeBehaviour
          if (logger.isDebugEnabled()) {
              logger.debug("This call is from checkout application : " + config.isCheckoutApplication());
          }
  
          final boolean displayShipsPrefix = isSapQuote
                  ? behaviourForCommitCode.isSapShipsLabelPrefixDisplayed()
                  : (config.isCheckoutApplication()
                  ? behaviourForCommitCode.isAosShipsLabelPrefixDisplayedCheckout()
                  : behaviourForCommitCode.isAosShipsLabelPrefixDisplayedMerchandising());
          behaviour.setShipsPrefixRequired(displayShipsPrefix);
  
          final boolean displayEnterAddress = isSapQuote ? false :
                  behaviourForCommitCode.isCartDeliveryCallToActionEnabled();
          behaviour.setAddressRequiredForDeliveryDates(displayEnterAddress);
  
          final boolean displayDeliveryQuote = isSapQuote ? true :
                  behaviourForCommitCode.isAosDeliveryQuoteEnabled();
          behaviour.setDeliversQuoteRequired(displayDeliveryQuote);
  
          // Only in PRE-RFC the flag CartShipsQuoteHiddenWhenDeliveryCallToActionVisible matters
          if (!isSapQuote && behaviour.isAddressRequiredForDeliveryDates()) {
              behaviour.setShipsQuoteRequired(!behaviourForCommitCode
                      .isCartShipsQuoteHiddenWhenDeliveryCallToActionVisible());
          }
  
          return behaviour;
      }
//       CommitCodeUtilImpl commitCodeUtilImpl = new CommitCodeUtilImpl();
//       shippingQuoteDisplayBehaviour = commitCodeUtilImpl.aosShippingQuoteDisplayFormatForCommitCode(Integer.toString(commitCode));

}


