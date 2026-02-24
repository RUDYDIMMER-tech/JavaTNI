package Banking;

import java.io.*;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    public String recordAccount() {
        if (isExistingAccount(getAccId())) {
            return "This account has been created!!";
        }

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(getFilename(), true))) {

            bw.write(toString());
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Created account success!!";
    }

    public boolean isExistingAccount(String account_name) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(getFilename()))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(account_name)) {
                    return true;
                }
            }

        } catch (IOException e) {
            // ถ้าไฟล์ยังไม่มี ถือว่ายังไม่มีบัญชี
            return false;
        }
        return false;
    }
}