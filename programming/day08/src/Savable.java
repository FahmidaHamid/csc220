/*
 * Any class that implements Savable can provide
 * data in a form that can be saved.
 *
 * We will discuss next week WHY using an interface here
 * makes our file-saving code more flexible.
 */
public interface Savable {

   /*
    * A default method provides an implementation directly
    * inside the interface.
    *
    * Classes implementing Savable may use this implementation
    * as-is, or override it if they need a different format.
    */

   public default String getDataToSave() {
      // Calls the toString() method of the actual object.
      // For example, a Student object will use Student.toString(),
      // while a Faculty object will use Faculty.toString().
      // note that if needed the class that implements this can override.
      return this.toString();
   }
}
