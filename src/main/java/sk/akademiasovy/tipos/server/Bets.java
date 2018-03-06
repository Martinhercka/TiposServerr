package sk.akademiasovy.tipos.server;


import sk.akademiasovy.tipos.server.db.MySQL;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bets")
public class Bets
{
    @POST
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public String newTicket(Ticket ticket)
    {
        MySQL mysql = new MySQL();
        boolean ret1 = mysql.checkLogin(ticket.login);
        boolean ret2 = mysql.checkToken(ticket.token);

        if(ret1&&ret2)
        {
            System.out.println("Token and login are okay");
            mysql.insertBets(ticket);
        }
        else
        {
            System.out.println("Invalid login or token");

        }
        return "{}";

    }

}
