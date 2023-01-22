import java.util.Collection;
import java.util.ArrayList;
public class Smartphone {
    static ArrayList aplicativosInstalados = new ArrayList();

    public static void exibirAppsInstalados() {
        aplicativosInstalados.add(ISmartphone.instalarApp());
        System.out.println(aplicativosInstalados.toString());

        return;
    }

    public static void recuperarMemoriaDisponivel(){
        return;
    }
}
