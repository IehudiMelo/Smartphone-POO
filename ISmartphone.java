public class ISmartphone {
//função de instalar aplicativos
    public static Object instalarApp(){
        App app = new App();
        app.titulo = "Whatsapp";
        app.fabricante = "Meta";
        app.tamanhoEmMB = 40000;
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
