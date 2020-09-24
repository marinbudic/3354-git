package adder;

public class Main {

    public static void main(String[] args) {
	 try {
		 int result = 0;
		 if(args[0].equals("-")){
			 result = addArguments(args, true);
		}
		else{
		 result = addArguments(args, false);
		}
        	 System.out.println(result);
        } catch (Exception e) {
		if(args.length != 3){
            System.err.println("Please provide three integers to add");
		}

		for(int i = 0; i < args.length; i++){
			if(!(Character.isDigit(args[i].indexOf(0)))){
				System.out.println("Please give only digits");
				break;
			}
		if(args.length < 4){
            System.err.println("Please provide three integers to add");
		}
		if(args[0] != "-" && !(Character.isDigit(args[0].indexOf(0)))){
			System.err.println("First character must be - or digit");
		}
        }
  }
}
    private static int addArguments(String[] args, boolean neg) {
	if(neg){
		return -1 * (Integer.valueOf(args[1]) + Integer.valueOf(args[2]) + Integer.valueOf(args[3]));
	}
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}
