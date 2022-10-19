package lesson5;

public class StringTask {
    public static void main(String[] args) {
        System.out.println(ConvertMonthInDateToWord("19.12.2003"));
        System.out.println( ConvertMonthInDateToNumber("15 декабря 2003"));
    }

    public static String ConvertMonthInDateToWord(String date) {
        String days = date.substring(0, 2);
        int day = Integer.parseInt(days);
        String month = date.substring(3, 5);

        if (date.length() != 10) {
            return "";
        } else {
            if (day <= 31) {
                if (month.equals("02") && day > 28) {
                    return "";
                }
                switch (month) {
                    case "01": {
                        date = date.replace(".01.", " января ");
                        break;
                    }
                    case "02": {
                        date = date.replace(".02.", " февраля ");
                        break;
                    }
                    case "03": {
                        date = date.replace(".03.", " марта ");
                        break;
                    }
                    case "04": {
                        date = date.replace(".04.", " апреля ");
                        break;
                    }
                    case "05": {
                        date = date.replace(".05.", " майя ");
                        break;
                    }
                    case "06": {
                        date = date.replace(".06.", " июня ");
                        break;
                    }
                    case "07": {
                        date = date.replace(".07.", " июля ");
                        break;
                    }
                    case "08": {
                        date = date.replace(".08.", " августа ");
                        break;
                    }
                    case "09": {
                        date = date.replace(".09.", " сентября ");
                        break;
                    }
                    case "10": {
                        date = date.replace(".10.", " октября ");
                        break;
                    }
                    case "11": {
                        date = date.replace(".11.", " ноября ");
                        break;
                    }
                    case "12": {
                        date = date.replace(".12.", " декабря ");
                        break;
                    }

                }
                return date;
            }
            return "";
        }
    }
    public static String ConvertMonthInDateToNumber(String date) {
        try {
            int lastIndex = date.length() - 5;
            String month = date.substring(3, lastIndex);
            switch (month) {
                case "января": {
                    date = date.replace(" января ", ".01.");
                    break;

                }
                case "февраля": {
                    date = date.replace(" февраля ", ".02.");
                    break;

                }
                case "марта": {
                    date = date.replace(" марта ", ".03.");
                    break;

                }
                case "апреля": {
                    date = date.replace(" апреля ", ".04.");
                    break;

                }
                case "майя": {
                    date = date.replace(" майя ", ".05.");
                    break;

                }
                case "июня": {
                    date = date.replace(" июня ", ".06.");
                    break;

                }
                case "июля": {
                    date = date.replace(" июля ", ".07.");
                    break;

                }
                case "августа": {
                    date = date.replace(" августа ", ".08.");
                    break;

                }
                case "сентября": {
                    date = date.replace(" сентября ", ".09.");
                    break;

                }
                case "октября": {
                    date = date.replace(" октября ", ".10.");
                    break;

                }
                case "ноября": {
                    date = date.replace(" ноября ", ".11.");
                    break;

                }
                case "декабря": {
                    date = date.replace(" декабря ", ".12.");
                    break;

                }
            }
            return date;
        } catch (Exception e) {
            return "";
        }

    }
}
