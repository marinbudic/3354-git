package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
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
		}
        }
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
    }
}
