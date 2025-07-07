class Unary{
    public static void main(String[] args){
        // program demonstrtating unary operators
        int accessLevel=1;
        boolean isLoggedIn=false;
        int upload=0;

        int passcode=4;
        System.out.println("Advaith's Log status:");
        System.out.println("Is Logged in:"+ isLoggedIn +" pls login");
        isLoggedIn=!isLoggedIn;
        System.out.println("Is Logged in:"+ isLoggedIn);
        System.out.println("Access Level:"+ (++accessLevel));
        upload++;
        System.out.println("Uploaded Assignments:"+ upload);
        upload--;
        System.out.println("if not uploaded assignment"+(upload));
        System.out.println("warning! Access level:"+ (--accessLevel));
        int warning=-accessLevel;
        System.out.println("You have no longer acces to the website :"+warning);
        int normalized=+accessLevel;
        System.out.println("Now you can access the resources:"+ (++normalized));
        int masked=~passcode;
        System.out.println("Masked passcode is:"+ masked);
        

    }
}