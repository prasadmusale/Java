package Advance_Java;

enum Status {
    Succeed, Failed, Pending, Ongoing;
}

public class concept1 {
    public static void main(String[] args) {
        Status s = Status.Succeed;

        System.out.println(s);

        Status[] ss = Status.values();

        for (Status n : ss) {
            System.out.println(n);
        }

        Status d = Status.Pending;

        System.out.println(d.ordinal());

        Status a = Status.Failed;
        switch (a) {
            case Succeed:
                System.out.println("Job has Succeed");
                break;

            case Failed:
                System.out.println("Job has Failed");
                break;

            case Pending:
                System.out.println("Job has Pending");
                break;

            case Ongoing:
                System.out.println("Job is Ongoing");
                break;

            default:
                System.out.println("Other status");

        }

        Status b = Status.Pending;

        if (b == Status.Succeed) {
            System.out.println("It is Succedd");
        } else if (b == Status.Pending) {
            System.out.println("It is Pending");
        } else {
            System.out.println("Other status");
        }
    }
}
