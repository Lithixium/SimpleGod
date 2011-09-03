/*
 * Copyright (C) 2011 <silence@immortal-forces.net>
 *
 * This file is part of the Bukkit plugin SimpleGod.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 * MA 02111-1307, USA.
 */

package net.immortal_forces.silence.plugin.simplegod;

import java.util.Timer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleGod
{ 
  private Timer m_Timer = new Timer(true);
  
  public SimpleGod()
  {
    super();
  }

  public void onEnable() 
  {
    PluginDescriptionFile pdfFile = this.getDescription();
    System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );

     m_Timer.schedule(new SimpleTimer(this), 0, 1000);
  }

  public void onDisable()
  {
    System.out.println("Goodbye world!");
  }

  public void handleHealth()
  {
    for ( Player player : getServer().getOnlinePlayers() )
      player.setHealth(200);
  }
}
