package envEff.envEffBackend;
import java.util.ArrayList;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import envEff.Util.PlugInCreation.EnvEntityClient;
import envEff.Util.PlugInCreation.EnvEntityServer;



public class EnvEffCommon {

	public EnvEffCommon(){
		
	}
	public void registerTickHandlers(){
		FMLCommonHandler.instance().bus().register(new EnvEffCommonTickHandler());
		
	}

}
