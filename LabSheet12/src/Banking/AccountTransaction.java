package Banking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountTransaction extends BankAccount implements Transactionable {

    public AccountTransaction(String accId) {
        super(accId);
    }

    public boolean hasAccountId() {
        try (BufferedReader br = new BufferedReader(
                new FileReader(getFilename()))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(getAccId())) {
                    setAccBalance(Double.parseDouble(data[1]));
                    return true;
                }
            }

        } catch (IOException e) {
            return false;
        }
        return false;
    }

    // ⭐ method อัปเดตไฟล์
    private void updateFile() {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader(getFilename()))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(getAccId())) {
                    lines.add(getAccId() + "," + getAccBalance());
                } else {
                    lines.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(getFilename()))) {

            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deposit(double amount) {
        setAccBalance(getAccBalance() + amount);
        updateFile();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getAccBalance()) {
            setAccBalance(getAccBalance() - amount);
            updateFile();
        }
    }

    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}