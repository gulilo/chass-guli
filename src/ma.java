public class ma {
    public static void main(String[]arr)
    {
        Screen s = new Screen();
	    while(s.isOpen())
	    {
		    s.repaint();
		    try {
			    Thread.sleep(100);
		    } catch (InterruptedException e) {
			    e.printStackTrace();
		    }
	    }
	    System.exit(0);
    }
}
