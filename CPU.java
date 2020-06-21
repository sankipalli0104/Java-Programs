public class CPU{
	private static class Processor{
		double cores;
        String manufacturer;

		public Processor(double cores, String manufacturer){
			this.cores = cores;
			this.manufacturer = manufacturer;
		}
		double getCache(){
        	return 4.3;
        }
	}
	public class RAM{
	
		int memory;
        String manufacturer;
        RAM(int memory, String manufacturer){
        	this.memory = memory;
        	this.manufacturer = manufacturer;
        }
        double getClockSpeed(){
            return 5.5;
        }
		
	}
	
	public static void main(String ... str){
		CPU cpu = new CPU();
		CPU.Processor processor = new CPU.Processor(12.33, "Intel");
		System.out.printf("Cores: %f and Manufacturer: %s \n",processor.cores, processor.manufacturer);
		System.out.println("Processor Cache =" +processor.getCache());
		CPU.RAM ram = cpu.new RAM(12, "Core");				
		System.out.printf("Memory: %d and Manufacturer: %s \n",ram.memory, ram.manufacturer);
		System.out.println("Processor Clockspeed =" +ram.getClockSpeed());
		
		
	}
}