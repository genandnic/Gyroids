package genandnic.gyroids.client;

import genandnic.gyroids.common.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	public static Minecraft minecraft = Minecraft.getMinecraft();

	@Override
	public void preInit(FMLPreInitializationEvent event) {

		super.preInit(event);
		// KeybindHandler.registerKeybinds();

	}

	@Override
	public void init(FMLInitializationEvent event) {

		super.init(event);
		// MinecraftForge.EVENT_BUS.register(new ClientTickListener());

	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {

		super.postInit(event);

	}

}
