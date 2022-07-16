public class Main {

    //שאלה 1
    // מחלקה היא מאפיינת אובייקט מסויים שלו יש תכונות וממנו ניתן ליצור אובייקטים שונים בעלי מאפיינים דומים

    //שאלה 2
    //יצירת קובץ חדש עם שם המחלקה שרוצים?

    //שאלה 3
    //פונקציה שתפקידה להראות את כלל המפיינים הנתונים במחלקה ותיאורם באופן כללי

    //שאלה 4
    //בנאי תפקידו לתת לכל אובייקט חדש שנוצר את המאפיינים היחודיים על פי נתוני המחלקה




    public static void main(String[] args) {
        Computer c = new Computer("Dell",2000,4,21.9F,true);
        System.out.println(c.toString());
        BankAccount b = new BankAccount("Omer",2993365.24);
        System.out.println(b.toString());
    }
}
