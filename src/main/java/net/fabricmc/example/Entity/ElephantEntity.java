package net.fabricmc.example.Entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

/*
 * Our Cube Entity extends PathAwareEntity, which extends MobEntity, which extends LivingEntity.
 *
 * LivingEntity has health and can deal damage.
 * MobEntity has movement controls and AI capabilities.
 * PathAwareEntity has pathfinding favor and slightly tweaked leash behavior.
 */
public class ElephantEntity extends PathAwareEntity {
 
    public ElephantEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}