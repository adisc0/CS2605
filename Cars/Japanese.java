public class Japanese extends Car {
    public Japanese(String b, String c){
        setBrand(b);
        setColor(c);
    }

    public void setBrand(String b)
    {
        if (b == "")
            brand = "noValue";
        else
            brand = b;
    }

    public void setColor(String c)
    {
        if (c == "")
            color = "noValue";
        else
            color = c;
    }


    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public void getDetails(){
        System.out.println("Brand: " + brand + "\nColor: " + color);

    }

}
