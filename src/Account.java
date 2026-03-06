public class Account {

    double capital;
    double rate;
    int term;


    double Compute_Balance() {
        return Math.pow(1 + rate, term) * capital;

    }
}
