package labaaaa;

public class TestAuthor {
    public static void main(String[] args) {
        Author Diana = new Author("Diana","diana@mail.ru",'F');
        Author Georgiy = new Author("Georgiy","georgiy@gmail.com",'M');
        Author  Tom =new Author("Tom","tom@mail.ru",'M');

        System.out.println(Diana.toString());
        System.out.println(Georgiy.toString());
        System.out.println(Tom.toString());

    }
}