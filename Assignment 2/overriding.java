class Result {
    public void result() {
        System.out.println("Result: Pass");
    }
}

class UGResult extends Result {
    public void result() {
        System.out.println("UG Result: Pass with Distinction");
    }
}

class PGResult extends Result {
    @Override
    public void result() {
        System.out.println("PG Result: Pass with High Distinction");
    }
}


public class overriding {
    public static void main(String[] args) {
        UGResult ugResult = new UGResult();
        PGResult pgResult = new PGResult();

        Result r = new Result();
        r.result();
        ugResult.result(); 
        pgResult.result(); 
    }
}
