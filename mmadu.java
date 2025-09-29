public class mmadu {
    public static void main(String[] args) {
        Human human1 = new Human();
        
        human1.setnoOfEyes(5);
        System.out.println(human1.getnoOfEyes());

        human1.setnoOfEars(2);
        System.out.println(human1.getnoOfEars()); 
        
        human1.setnoOfMouth(1);
        System.out.println(human1.getnoOfMouth());

        human1.setnoOfNoses(2);
        System.out.println(human1.getnoOfNoses());

        human1.setnoOfSkin(2);
        System.out.println(human1.getnoOfSkin());

        human1.setskinTone("matte black");
        System.out.println(human1.getskintone());
    }

    
}

class Human{
    private int noOfEyes;
    private int noOfNoses;
    private int noOfMouth;
    private int noOfEars;
    private int noOfSkin;
    private String skinTone;
    
    //noOfEyes
    public int getnoOfEyes(){
        return noOfEyes;
    }

    public void setnoOfEyes(int noOfEyes){
        this.noOfEyes=noOfEyes;
    }

    //noOfNoses
    public int getnoOfNoses(){
        return noOfNoses;
    }

    public void setnoOfNoses(int noOfNoses){
        this.noOfNoses=noOfNoses;
    }
    //noOfMouth
    public int getnoOfMouth(){
        return noOfMouth;
    }

    public void setnoOfMouth(int noOfMouth){
        this.noOfMouth = noOfMouth;
    }

    //noOfEars
    public int getnoOfEars(){
        return noOfEars;
    }

    public void setnoOfEars(int noOfEars){
        this.noOfEars=noOfEars;
    }

    //noOfSkin
    public int getnoOfSkin(){
        return noOfSkin;
    }

    public void setnoOfSkin(int noOfSkin){
        this.noOfSkin=noOfSkin;
    }

    //skkintone
    public String getskintone(){
        return skinTone;
    }

    public void setskinTone(String skinTone){
        this.skinTone=skinTone;
    }
}