package OlderPackage.AmazonQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class DebtRecords {

    public class debtRecord {
        String borrower = "";
        String lender = "";
        int amount = 0;

        debtRecord() {
            // empty constructor
        }

        debtRecord(String borrower, String lender, int amount) {
            this.borrower = borrower;
            this.lender = lender;
            this.amount = amount;
        }
    }

    public class Solution {
        List<String> minimumDebtMembers(List<debtRecord> records) {
            TreeMap<String, Integer> map = new TreeMap<>();
            for (debtRecord record : records) {
                map.put(record.borrower, map.getOrDefault(record.borrower, 0) - record.amount);
                map.put(record.lender, map.getOrDefault(record.lender, 0) + record.amount);
            }
            int min = Integer.MAX_VALUE;
            List<String> result = new ArrayList<>();
            for (String k : map.keySet()) {
                if (min > map.get(k)) {
                    result = new ArrayList<>();
                    result.add(k);
                    min = map.get(k);
                } else if (min == map.get(k)) {
                    result.add(k);
                }
            }
            if (min >= 0) {
                result = new ArrayList<>();
                result.add("Nobody has a negative balance");
            } else {
                Collections.sort(result);
            }
            return result;
        }
    }

}
