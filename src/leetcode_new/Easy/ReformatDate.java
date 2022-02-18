package leetcode_new.Easy;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

class reformatDate {
//    Input: date = "20th Oct 2052"
//    Output: "2052-10-20"

    public String reformatDate(String date) {
        String[] arr = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(arr[2]);
        sb.append("-" + getMonth(arr[1]));
        sb.append("-" + getDay(arr[0]));
        return sb.toString();
    }

    private String getDay(String s) {
        String str = s.substring(0, s.length() - 2);
        return (str.length() == 1) ? "0" + str : str;
    }

    public static void main(String[] args) {
        reformatDate reformatDate = new reformatDate();
        System.out.println(reformatDate.reformatDate("6th Jun 1933"));
    }

    private String getMonth(String s) {
        switch (s) {
            case "Jan":
                return "01";
            case "Feb":
                return "02";
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";
            default:
                return "";
        }
    }
}
