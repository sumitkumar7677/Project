    class Arg
    {
        public static void main(String[] args)
        {


            if (args.length > 0)
            {
                System.out.println("The command line"+
                        " arguments are:");

                // iterating the args array and printing
                // the command line arguments
                for (String val:args)
                    System.out.println(val);
            }
            else
                System.out.println("No command line "+
                        "arguments found.");
        }
    }

