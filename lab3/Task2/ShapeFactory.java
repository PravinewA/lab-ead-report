public class ShapeFactory {
	
   public Shape getShape(String type){
      if(type == null){
         return null;
      }	else if(type == "CIRCLE"){
         return new Circle(); 
      } else if(type == "RECTANGLE"){
         return new Rectangle();
      } else if(type == "SQUARE"){
         return new Square();
      }
      return null;
   }
}