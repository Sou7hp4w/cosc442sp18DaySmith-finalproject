/**
 *  Copyright (C) 2002-2015   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui;

// TODO: Auto-generated Javadoc
/**
 * Used for transferring data for the savegame to be loaded.
*/
public class LoadingSavegameInfo {

    /** The single player. */
    private final boolean singlePlayer;
    
    /** The port. */
    private final int port;
    
    /** The server name. */
    private final String serverName;

    /**
     * Instantiates a new loading savegame info.
     *
     * @param singlePlayer the single player
     * @param port the port
     * @param serverName the server name
     */
    public LoadingSavegameInfo(boolean singlePlayer, int port, String serverName) {
        this.singlePlayer=singlePlayer;
        this.port=port;
        this.serverName=serverName;
    }

    /**
     * Is a single player game selected?.
     *
     * @return True if single player is selected.
     */
    public boolean isSinglePlayer() {
        return singlePlayer;
    }

    /**
     * Get the selected port number.
     *
     * @return The port number.
     */
    public int getPort() {
        return port;
    }

    /**
     * Get the specified server name.
     *
     * @return The server name.
     */
    public String getServerName() {
        return serverName;
    }

}
