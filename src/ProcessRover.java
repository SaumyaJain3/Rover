public class ProcessRover {
    private String input;
    Rover rover;
    public ProcessRover(String input) {
        this.input=input;
    }
    public String decode()
    {
        String[] lines=input.split(System.getProperty("line.separator"));
        for(int i=0;i< lines.length;i++)
        {
            lines[i]=lines[i].replace(" ","");
            if(i==0)
            {
                char va=lines[i].charAt(0);
                System.out.println((int)va);
             rover=new Rover(lines[i].charAt(0),lines[i].charAt(1),Direction.NORTH);
            }
            else {
                for (int j = 0; j < lines[i].length(); j++) {
                    System.out.println(lines[i].charAt(j));
                    rover.process(lines[i].charAt(j));
                }
            }

        }
        return " ";
    }
//    public void main(String[] args)
//    {
//        ProcessRover processRover=new ProcessRover("1 2 N" +
//                "LMLMLMLMM");
//    }
}
