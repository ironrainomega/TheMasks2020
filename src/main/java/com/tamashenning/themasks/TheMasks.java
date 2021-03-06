package com.tamashenning.themasks;

import com.tamashenning.themasks.core.Config;
import com.tamashenning.themasks.core.EventHandler;
import me.ichun.mods.ichunutil.client.head.HeadBase;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.FMLNetworkConstants;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.BooleanSupplier;

@Mod(TheMasks.MOD_ID)
public class TheMasks
{
    public static final String MOD_NAME = "The Masks 2020";
    public static final String MOD_ID = "themasks2020";

    public static final Logger LOGGER = LogManager.getLogger();

    public static Config config;

    public static EventHandler eventHandler;

    public TheMasks()
    {
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            config = new Config().init();

            MinecraftForge.EVENT_BUS.register(eventHandler = new EventHandler());

            ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.CONFIGGUIFACTORY, () -> me.ichun.mods.ichunutil.client.core.EventHandlerClient::getConfigGui);

            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::finishLoading);
        });
        DistExecutor.runWhenOn(Dist.DEDICATED_SERVER, () -> () -> LOGGER.log(Level.ERROR, "You are loading " + MOD_NAME + " on a server. " + MOD_NAME + " is a client only mod!"));

        //Make sure the mod being absent on the other network side does not cause the client to display the server as incompatible
        ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.DISPLAYTEST, () -> Pair.of(() -> FMLNetworkConstants.IGNORESERVERONLY, (a, b) -> true));
    }

    @OnlyIn(Dist.CLIENT)
    private void finishLoading(FMLLoadCompleteEvent event)
    {
        eventHandler.addLayers(); //Let's add the layers
    }
}
