package EnumExample;

public enum CustomEnum {
    MONDAY(0,"first day of the week"),
    TUESDAY(1,"Second Day of week");
    private int val;
    private String comment;

    CustomEnum(int val, String comment){
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }
    public String getComment(){
        return comment;
    }

    public static CustomEnum getNameFromVal(int val){
        for(CustomEnum customEnum:CustomEnum.values()){
            if(customEnum.val == val){
                return customEnum;
            }
        }
        return null;
    }
}
