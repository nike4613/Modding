package net.mc42.mods.TPDWSP;

import net.mc42.mods.TPDWSP.blocks.*;
import net.mc42.mods.TPDWSP.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TPDWSP.MODID, version = TPDWSP.VERSION,dependencies = "required-after:Thaumcraft;required-after:LeVCore")
public class TPDWSP
{
    public static final String MODID = "TPDWSP";
    public static final String VERSION = "0.0";
    
    //Pearwood
    public Block pearwood;
    public Block pearwood_planks;
    public Block pearwood_leaves;
    //Sapient Pearwood
    public Block sapient_pearwood;
    public Block sapient_pearwood_planks;
    public Block sapient_pearwood_leaves;
    //Pear
    public Item pear;
    //Pear Sapling
    public Block pear_sapling;
    //Sapient Pear Sapling
    public Block sapient_pear_sapling;
    
    @SidedProxy(clientSide="net.mc42.mods.TPDWSP.proxies.ClientProxy", serverSide="net.mc42.mods.TPDWSP.proxies.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    	pearwood = ( new Pearwood(Material.wood)
    		.setHardness(0.5F).setStepSound(Block.soundTypeWood))
            .setBlockName("pearwood").setCreativeTab(CreativeTabs.tabBlock);
    	pearwood_planks = ( new PearwoodPlanks(Material.wood)
			.setHardness(0.5F).setStepSound(Block.soundTypeWood))
			.setBlockName("pearwood_planks").setCreativeTab(CreativeTabs.tabBlock);
    	
    	GameRegistry.registerBlock(pearwood, "pearwood");
    	GameRegistry.registerBlock(pearwood_planks, "pearwood_planks");
    }
    
    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
    }
    
    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}