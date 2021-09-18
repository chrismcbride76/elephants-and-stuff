package net.fabricmc.example.Entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

/*
 * A renderer is used to provide an entity model, shadow size, and texture.
 */
public class ElephantEntityRenderer extends MobEntityRenderer<ElephantEntity, ElephantEntityModel> {
 
    public ElephantEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ElephantEntityModel(), 0.5f);
    }
 
    @Override
    public Identifier getTexture(ElephantEntity entity) {
        return new Identifier("modid", "textures/entity/elephant.png");
    }
}