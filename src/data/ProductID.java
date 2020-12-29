package data;

final public class ProductID {
  private final string productID
  
  public ProductID(string code){
    this.productID = code;
  }
  
  public String getProductID{
    return productID;
  }
  
  public boolean equals (object o){
    if(this==o) return true;
    if(o==null ||  getClass != o.getClass) return false
    productID prodID = (productID)o
    return productID.equals (prodID.productID);
  }
  
  public int hashCode(){
    return productID.hashCode();
  }
  public String toString(){
  return "ProductID{" + "personal code='" + productID + '\'' + '}';
  }
}
