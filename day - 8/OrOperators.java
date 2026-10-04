

class OrOperators
{
    public static void main(String args[])
    {
        int minAge = 1;
        int maxAge = 60;

        String name = args[0];
        int userAge = Integer.parseInt(args[1]);

        System.out.println("Applying DL For : " + name);
        System.out.println("Conditional : " + (minAge < userAge));
        System.out.println("Conditional : " + (maxAge > userAge));

        System.out.println("Allowed to Apply For DL : " 
                + ((minAge < userAge) && (maxAge > userAge)));

        String Message = minAge < userAge ? "Allowed" : "NotAllowed";

        System.out.println(Message);
    }
}