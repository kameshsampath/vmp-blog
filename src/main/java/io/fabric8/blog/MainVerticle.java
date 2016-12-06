package io.fabric8.blog;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.*;

public class MainVerticle extends AbstractVerticle {

	@Override
	public void start() {
		vertx.createHttpServer()
				.requestHandler(req -> req.response().end("Hello World, it works !"))
				.listen(8080);
	}
}
