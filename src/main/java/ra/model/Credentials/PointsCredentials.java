package ra.model.Credentials;

import javax.validation.constraints.NotEmpty;

public class PointsCredentials {

    private String x;



    private String y;


    private String r;

    private String result;

    public String isResult() {
        return result;
    }

    public void setResult(String x, String y, String r){
        Double xx = Double.parseDouble(x.replace(",","."));
        Double yy = Double.parseDouble(y.replace(",","."));
        Double rr = Double.parseDouble(r.replace(",","."));
        //ban nguyet
        boolean area1 = xx >= -rr/2 && xx <= 0 && yy <= 0 && yy >= -rr/2 && xx*xx + yy*yy <= rr*rr/4;
        //hinh chu nhat
        boolean area2 = xx <= 0 && xx >= -rr/2 && yy >= 0 && yy <= rr;
       //tam giac
        boolean area3 = xx >= 0 && xx <= rr && yy >= -rr && yy <= 0 && yy >= xx - rr;
        if (area1 | area2 | area3) {
            this.result = "true";
        } else {
            this.result = "false";
        }
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

}
