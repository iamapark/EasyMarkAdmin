package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.vertx.java.core.Handler;
import org.vertx.java.core.Vertx;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.json.JsonObject;

import com.nhncorp.mods.socket.io.SocketIOServer;
import com.nhncorp.mods.socket.io.SocketIOSocket;
import com.nhncorp.mods.socket.io.impl.DefaultSocketIOServer;
import com.nhncorp.mods.socket.io.impl.Namespace;

import dto.Member;

public class MessageServer {
	/*private Vertx vt;
	private SocketIOServer io;
	private HashMap<String, SocketIOSocket> sockets;
	public static MessageServer server = null;
	private AdminServer adminServer = null;
	
	public static MessageServer getInstance(){
		if(server == null)
			server = new MessageServer();
		return server;
	}
	
	private MessageServer(){
		this.vt = Vertx.newVertx();
		sockets = new HashMap<String, SocketIOSocket>();
		adminServer = AdminServer.getInstance();
		System.out.println("MessageServer Constructor!!");
	}
	
	public void start(){
		HttpServer server = vt.createHttpServer();
		io = new DefaultSocketIOServer(vt, server);
		final Namespace message = io.of("/message");
		
		message.onConnection(new Handler<SocketIOSocket>(){
			@Override
			public void handle(final SocketIOSocket socket) {
				socket.on("userId", new Handler<JsonObject>(){
					@Override
					public void handle(JsonObject data) {
						register(data.getString("id"), socket);
					}
				});
				
				socket.on("send", new Handler<JsonObject>(){
					public void handle(JsonObject data){
						sendMessage(data.getString("friendId"), data.getString("message"));
					}
				});
				
				socket.on("exit", new Handler<JsonObject>(){
					@Override
					public void handle(JsonObject data) {
						System.out.println(data.getString("id"));
						sockets.remove(data.getString("id"));
						System.out.println("exit");
						System.out.println("size: " + sockets.size());
						adminServer.pushLoginMemberCount(getLoginMemberCount());
						adminServer.refreshLogoutMember(data.getString("id"));
					}
				});
				
				socket.onDisconnect(new Handler<JsonObject>() {
					public void handle(JsonObject event) {
						System.out.println("disconnect");
					}
				});
			}
				
		});
		
		server.listen(9090);
	}
	
	private void register(String id, SocketIOSocket socket){
		if(!isContains(id)){
			sockets.put(id,  socket);
		}
		adminServer.pushLoginMemberInfo(id);
		adminServer.pushLoginMemberCount(getLoginMemberCount());
		System.out.println("(등록)id:" + id);
		System.out.println("접속 회원 수: " + sockets.size());
	}
	
	public void sendMessage(String id, String msg){
		System.out.println("(전송)id: " + id + ", msg: " + msg);
		JsonObject data = new JsonObject();
		data.putString("msg", msg);
		sockets.get(id).emit("message", data);
	}

	public boolean isContains(String userId) {
		return sockets.containsKey(userId);
	}

	public int getLoginMemberCount() {
		return sockets.size();
	}

	public String[] getLoginMemberList() {
		System.out.println("접속 중인 회원 수: " + sockets.size());
		String[] loginMemberIdArray = new String[sockets.size()];
		int count = 0;
		Set<String> set = sockets.keySet();
		Iterator<String> iter = set.iterator();

		while(iter.hasNext()){
			loginMemberIdArray[count++] = iter.next();
		}
		
		return loginMemberIdArray;
	}*/
}
