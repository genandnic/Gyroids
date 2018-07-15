package genandnic.gyroids;

import genandnic.gyroids.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Gyroids.MODID, name = Gyroids.NAME, version = Gyroids.VERSION)
public class Gyroids {
	public static final String MODID = "gyroids";
	public static final String NAME = "Gyroids";
	public static final String VERSION = "1.12.2-1.0.0";

	public static final String CLIENT_PROXY = "genandnic.gyroids.client.ClientProxy";
	public static final String SERVER_PROXY = "genandnic.gyroids.common.CommonProxy";

	@SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.preInit(event);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		proxy.init(event);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit(event);

	}
}
