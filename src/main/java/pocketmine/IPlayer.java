package pocketmine;

import pocketmine.permission.ServerOperator;
import pocketmine.metadata.Metadatable;

public interface IPlayer extends ServerOperator, Metadatable
{

  boolean isOnline ();

  String getName ();

  boolean isBanned ();

  void setBanned (boolean value);

  boolean isWhitelisted ();

  void setWhitelisted (boolean value);

  Player getPlayer ();

  Long getFirstPlayed ();

  Long getLastPlayed ();

  boolean hasPlayedBefore ();
}
