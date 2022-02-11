package CharacterServer.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class CharServer {


    private EventLoopGroup bossGroup = new NioEventLoopGroup();   //1
    private EventLoopGroup workerGroup = new NioEventLoopGroup();

    private int port = 14011;

    public void run() throws InterruptedException {
        ServerBootstrap b = new ServerBootstrap();                  //2
        b.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)              //3
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline()
                                //.addLast(new LengthFieldBasedFrameDecoder(Integer.MAX_VALUE, 2, 1, 1, 0))
                                .addLast(new CharServerHandler());
                                //.addLast(new LoginServerEncoder());
                    }
                })
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true);


        ChannelFuture f = b.bind(port).sync();

//        f.channel().closeFuture().sync().channel();
    }
}
