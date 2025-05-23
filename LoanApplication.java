// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class LoanApplication {
   public LoanApplication() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number of users: ");
      int var2 = var1.nextInt();
      var1.nextLine();
      System.out.println("\nSno\tLoan_ID\tGender\tMarried\tDependents\tEducational\tSelf_Employed\tApplicantIncome\tLoanAmount\tLoan_Amount_Term\tCredit_History\tProperty_Area\tLoan_Statue");

      for(int var3 = 0; var3 < var2; ++var3) {
         System.out.println("User " + (var3 + 1) + ":");
         System.out.print("Enter Sno: ");
         int var4 = var1.nextInt();
         var1.nextLine();
         System.out.print("Enter Loan_ID: ");
         String var5 = var1.nextLine();
         System.out.print("Enter Gender: ");
         String var6 = var1.nextLine();
         System.out.print("Enter Married (Y/N): ");
         String var7 = var1.nextLine();
         System.out.print("Enter Dependents: ");
         int var8 = var1.nextInt();
         var1.nextLine();
         System.out.print("Enter Educational (Y/N): ");
         String var9 = var1.nextLine();
         System.out.print("Enter Self_Employed (Y/N): ");
         String var10 = var1.nextLine();
         System.out.print("Enter ApplicantIncome: ");
         double var11 = var1.nextDouble();
         System.out.print("Enter LoanAmount: ");
         double var13 = var1.nextDouble();
         System.out.print("Enter Loan_Amount_Term: ");
         int var15 = var1.nextInt();
         System.out.print("Enter Credit_History: ");
         int var16 = var1.nextInt();
         System.out.print("Enter Property_Area: ");
         String var17 = var1.next();
         System.out.print("Enter Loan_Status: ");
         String var18 = var1.next();
         System.out.println(var4 + "\t" + var5 + "\t" + var6 + "\t" + var7 + "\t" + var8 + "\t\t" + var9 + "\t\t" + var10 + "\t\t" + var11 + "\t\t" + var13 + "\t\t" + var15 + "\t\t" + var16 + "\t\t" + var17 + "\t\t" + var18);
      }

      var1.close();
   }
}
