package amaliy_vazifa_OOP;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this(0, 0, 0);
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second value!");
        }
    }

    public void setHour(int hour) {
        setTime(hour, this.minute, this.second);
    }

    public void setMinute(int minute) {
        setTime(this.hour, minute, this.second);
    }

    public void setSecond(int second) {
        setTime(this.hour, this.minute, second);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public MyTime nextSecond() {
        if (this.second == 59) {
            if (this.minute == 59) {
                if (this.hour == 23) {
                    return new MyTime(0, 0, 0);
                } else {
                    return new MyTime(this.hour + 1, 0, 0);
                }
            } else {
                return new MyTime(this.hour, this.minute + 1, 0);
            }
        } else {
            return new MyTime(this.hour, this.minute, this.second + 1);
        }
    }

    public MyTime nextMinute() {
        if (this.minute == 59) {
            if (this.hour == 23) {
                return new MyTime(0, 0, 0);
            } else {
                return new MyTime(this.hour + 1, 0, 0);
            }
        } else {
            return new MyTime(this.hour, this.minute + 1, 0);
        }
    }

    public MyTime nextHour() {
        if (this.hour == 23) {
            return new MyTime(0, 0, 0);
        } else {
            return new MyTime(this.hour + 1, 0, 0);
        }
    }

    public MyTime previousSecond() {
        if (this.second == 0) {
            if (this.minute == 0) {
                if (this.hour == 0) {
                    return new MyTime(23, 59, 59);
                } else {
                    return new MyTime(this.hour - 1, 59, 59);
                }
            } else {
                return new MyTime(this.hour, this.minute - 1, 59);
            }
        } else {
            return new MyTime(this.hour, this.minute, this.second - 1);
        }
    }

    public MyTime previousMinute() {
        if (this.minute == 0) {
            if (this.hour == 0) {
                return new MyTime(23, 59, 0);
            } else {
                return new MyTime(this.hour - 1, 59, 0);
            }
        } else {
            return new MyTime(this.hour, this.minute - 1, 0);
        }
    }

    public MyTime previousHour() {
        if (this.hour == 0) {
            return new MyTime(23, 0, 0);
        } else {
            return new MyTime(this.hour - 1, 0, 0);
        }
    }

    private boolean isValidTime(int hour, int minute, int second) {
        return 0 <= hour && hour <= 23 && 0 <= minute && minute <= 59 && 0 <= second && second <= 59;
    }
}
class Main {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(23, 59, 59);
        System.out.println("Initial time: " + time1);

        System.out.println("Next second: " + time1.nextSecond());
        System.out.println("Next minute: " + time1.nextMinute());
        System.out.println("Next hour: " + time1.nextHour());

        System.out.println("Previous second: " + time1.previousSecond());
        System.out.println("Previous minute: " + time1.previousMinute());
        System.out.println("Previous hour: " + time1.previousHour());

        time1.setHour(12);
        time1.setMinute(34);
        time1.setSecond(56);
        System.out.println("Time after setters: " + time1);

        try {
            MyTime invalidTime = new MyTime(24, 59, 59);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}