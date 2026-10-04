class Operators 
{
public static void main(String args [])
{
int minAge = 18;
int userAge = Integer.parseInt(args[1]);
String name = args[0];
System.out.println("Applying DL For :"+ name );
System.out.println("Allowned to apply For DL :" + (minAge < userAge ));
}
}