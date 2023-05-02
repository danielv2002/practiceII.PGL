
package  practica2PGL;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
public class main {
    public static void main(String [] args)throws IOException {
        List<venta> ventas =new ArrayList<>();/*se crea un array List del pojo venta*/
        try{

             Path path = Paths.get("sales_data.csv");/*se crea un objeto path para guardar la ruta del archivo */
                Files.lines(path).forEach(line->{
                    String[]arreglo=Pattern.compile(",").split(line);

                venta v2 = new venta(Integer.parseInt(arreglo[0]), Integer.parseInt(arreglo[1]), Double.parseDouble(arreglo[2]), Integer.parseInt(arreglo[3]), Integer.parseInt(arreglo[4]), arreglo[5], arreglo[6], Integer.parseInt(arreglo[7]), Integer.parseInt(arreglo[8]), Integer.parseInt(arreglo[9]), arreglo[10], arreglo[11], Integer.parseInt(arreglo[12]), arreglo[13], Integer.parseInt(arreglo[14]), arreglo[15], arreglo[16], arreglo[17], arreglo[18], Integer.parseInt(arreglo[19]), arreglo[20], arreglo[21], arreglo[22], arreglo[23], arreglo[24]);
                    ventas.add(v2);/*se usa el metodo lines de la clase files y el metodo foreach para crear un vector de strings de cada venta y se guarda en la lista del pojo */


    });
                }catch (IOException e){
            e.printStackTrace();/*metodo printstracktrace para ver hasta donde lanzó error el archivo y una lista de los metodos usados*/
        }
        List<venta> ny = ventas.stream().filter(venta->venta.getCity().equals("NY"))
                .collect(Collectors.toList());
        ny.forEach(System.out::println);/*coleccion de nueva york*/

         int totalNY = Integer.parseInt(String.valueOf(ny.stream().mapToInt(venta->{
        int total=0;
            total= total+(venta.getProductC()*venta.getCantidad());

            return total;
         }).sum()));/*total de ventas de nueva york*/

        List<venta> nyclassic = ny.stream().filter(venta-> venta.getProductL().equals("classic car"))
                .collect(Collectors.toList());
        nyclassic.forEach(System.out::println);/*ventas de autos clasicos de nuevayork*/

         int totalclassic = Integer.parseInt(String.valueOf(nyclassic.stream().mapToInt(venta->{

            int total=0;
            total= total+(venta.getCantidad()*venta.getProductC());
        return total;
        }).sum()));/*total de ventas de autos clasicos de nueva york*/

        List<venta> nymotor =ny.stream().filter(venta->venta.getProductL().equals("motorcycles"))
                .collect(Collectors.toList());
        nymotor.forEach(System.out::println);/*ventas de motos de nueva york*/

        int totalmotor= Integer.parseInt(String.valueOf(nymotor.stream().mapToInt(venta->{
            int total=0;
            total= total+(venta.getCantidad()*venta.getProductC());
            return total;
        }).sum()));/*total ventas motos de nueva york*/
     venta mayornybuyer=  ny.stream()
             .max(Comparator.comparing(venta::getCantidad))
             .orElse(null);
     System.out.println("el mayor comprador de "+mayornybuyer.getCity()+"fue "+mayornybuyer);/*mayor comprador de nueva york*/

     venta mayort = ventas.stream().max(Comparator.comparing(venta::getCantidad))
             .orElse(null);
     System.out.println("el mayor comprador fue "+mayort);/*mayor comprador del archivo*/

     venta menor =ventas.stream().min(Comparator.comparing(venta::getCantidad))
             .orElse(null);
     System.out.println(("el menor comprador fue " +menor));/*menor comprador del archivo*/
    }
}




