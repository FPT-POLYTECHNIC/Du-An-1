package poly.app.core.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import poly.app.core.dao.DoAnChiTietDao;
import poly.app.core.daoimpl.DoAnChiTietDaoImpl;
import poly.app.core.entities.DoAnChiTiet;
import poly.app.core.utils.JsonFactoryUtil;

@Path("do-an-chi-tiet")
public class DoAnChiTietAPI {

    DoAnChiTietDao doAnChiTietDao = new DoAnChiTietDaoImpl();

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") Integer id) {
        DoAnChiTiet entity = doAnChiTietDao.getById(id);
        if (entity == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Entity not found for id: " + id).build();
        }

        String json;
        try {
            json = JsonFactoryUtil.toJson(entity);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(DinhDangPhimAPI.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().entity(ex).build();
        }
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        List<DoAnChiTiet> list = doAnChiTietDao.getAll();
        String json;
        try {
            json = JsonFactoryUtil.toJson(list);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(DinhDangPhimAPI.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().entity(ex).build();
        }
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("order")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllAndOrderBySize() {
        List<DoAnChiTiet> list = doAnChiTietDao.getAllAndOrderBySize();
        String json;
        try {
            json = JsonFactoryUtil.toJson(list);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(DinhDangPhimAPI.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().entity(ex).build();
        }
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insert(String json) {
        DoAnChiTiet doAnChiTiet = null;
        try {
            doAnChiTiet = JsonFactoryUtil.toObject(json, new TypeReference<DoAnChiTiet>() {
            });
            doAnChiTietDao.insert(doAnChiTiet);
        } catch (Exception ex) {
            Logger.getLogger(DoAnChiTietAPI.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().entity(ex.getMessage()).build();
        }

        return Response.ok().build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(String json) {
        DoAnChiTiet doAnChiTiet = null;
        try {
            doAnChiTiet = JsonFactoryUtil.toObject(json, new TypeReference<DoAnChiTiet>() {
            });
            doAnChiTietDao.update(doAnChiTiet);
        } catch (Exception ex) {
            Logger.getLogger(DoAnChiTietAPI.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().entity(ex.getMessage()).build();
        }

        return Response.ok().build();
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(String json) {
        DoAnChiTiet doAnChiTiet = null;
        try {
            doAnChiTiet = JsonFactoryUtil.toObject(json, new TypeReference<DoAnChiTiet>() {
            });
            doAnChiTietDao.delete(doAnChiTiet);
        } catch (Exception ex) {
            Logger.getLogger(DoAnChiTietAPI.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().entity(ex.getMessage()).build();
        }

        return Response.ok().build();
    }
    
    @DELETE
    @Path("{id}")
    public Response deleteById(@PathParam("id") Integer id) {
        try {
            doAnChiTietDao.deleteById(id);
        } catch (Exception ex) {
            Logger.getLogger(DoAnChiTietAPI.class.getName()).log(Level.SEVERE, null, ex);
            return Response.serverError().entity(ex.getMessage()).build();
        }

        return Response.ok().build();
    }
}
