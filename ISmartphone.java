public class ISmartphone {
//função de instalar aplicativos
    public static App instalarApp(){
        App app = new App();
        app.titulo = "Whatsapp";
        app.fabricante = "Meta";
        app.tamanhoEmMB = 36;

        System.out.println(app.titulo);
        System.out.println(app.fabricante);
        System.out.println(app.tamanhoEmMB);
        return app;

    }
//função de desinstalar aplicativos
    public static void desinstalarApp(){

        return;
    }
//função de recuperar aplicativos instalados
    public static void recuperarAppsInstalados(){
        return;
    }
}
