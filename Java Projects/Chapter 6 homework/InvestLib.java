package hmwk05_06;

enum Type {
    MONTHLY, SEMIANNUAL, ANNUAL
}

public class InvestLib {

    public static Type firstPrint(double initialInvestment, double annualInterest, Compound(value);, int years) {
        
    private static double total = initialInvestment;
    private static double tempInterest;

    switch (value) {
        case ANNUAL:
            for (int i = 1; i <= years; i++) {
                for (int j = 1; j <= 1; j++) {
                    //initialInvestment += periodicInvestment;
                    //total += periodicInvestment;
                    tempInterest = (annualInterest / 100) * total;
                    total += tempInterest;
                    System.out.println();
                    return System.out.printf("%02d-%02d %10.2f %10.2f", i, j, initialInvestment, total);
                }
            }

            break;
        case MONTHLY:
            for (int i = 1; i <= years; i++) {
                for (int j = 1; j <= 12; j++) {
                    //initialInvestment += periodicInvestment;
                    //total += periodicInvestment;
                    tempInterest = (annualInterest / 100 / 12) * total;
                    total += tempInterest;
                    System.out.println();
                    return System.out.printf("%02d-%02d %10.2f %10.2f", i, j, initialInvestment, total);
                }
            }
            break;
        case SEMIANNUAL:
            for (int i = 1; i <= years; i++) {
                for (int j = 1; j <= 2; j++) {
                    //initialInvestment += periodicInvestment;
                    //total += periodicInvestment;
                    tempInterest = (annualInterest / 100 / 2) * total;
                    total += tempInterest;
                    System.out.println();
                    return System.out.printf("%02d-%02d %10.2f %10.2f", i, j, initialInvestment, total);
                }
            }
            break;
    }
       
}
public static Type secondPrint(double initialInvestment, double annualInterest, Compound(value);, int years, double periodicInvestment) {

        switch (value) {
            case ANNUAL:
                for (int i = 1; i <= years; i++) {
                    for (int j = 1; j <= 1; j++) {
                        initialInvestment += periodicInvestment;
                        total += periodicInvestment;
                        tempInterest = (annualInterest / 100) * total;
                        total += tempInterest;
                        System.out.println();
                        return System.out.printf("%02d-%02d %10.2f %10.2f", i, j, initialInvestment, total);
                    }
                }

                break;
            case MONTHLY:
                for (int i = 1; i <= years; i++) {
                    for (int j = 1; j <= 12; j++) {
                        initialInvestment += periodicInvestment;
                        total += periodicInvestment;
                        tempInterest = (annualInterest / 100 / 12) * total;
                        total += tempInterest;
                        System.out.println();
                        return System.out.printf("%02d-%02d %10.2f %10.2f", i, j, initialInvestment, total);
                    }
                }
                break;
            case SEMIANNUAL:
                for (int i = 1; i <= years; i++) {
                    for (int j = 1; j <= 2; j++) {
                        initialInvestment += periodicInvestment;
                        total += periodicInvestment;
                        tempInterest = (annualInterest / 100 / 2) * total;
                        total += tempInterest;
                        System.out.println();
                        return System.out.printf("%02d-%02d %10.2f %10.2f", i, j, initialInvestment, total);
                    }
                }
                break;
        }

    }
    public static Type Compound(String value){
            if (value == "monthly") {
                return Type.MONTHLY;
            } else if  (value == "semi") {
                return Type.ANNUAL;
            }
            return Type.ANNUAL;
        }
    }
