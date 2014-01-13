package envEff.envEffBackend;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
//import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
//import envEff.EnvEffCommonTickHandler;


public class EnvEffClient extends EnvEffCommon{

	public EnvEffClient(){
		super();
	}
	
	@Override
	public void registerTickHandlers(){
		FMLCommonHandler.instance().bus().register(new EnvEffClientTickHandler());
		//((FMLCommonHandler) FMLClientHandler.instance()).bus().register(new EnvEffClientTickHandler());
//		MinecraftForge.EVENT_BUS.register(new EnvEffClientTickHandler());
//		MinecraftForge.EVENT_BUS.register(new EnvEffCommonTickHandler());
	}
}
