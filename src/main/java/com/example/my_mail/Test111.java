package com.example.my_mail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * @author yanghexiang
 * @date: 2021/11/17 12:20
 **/
public class Test111 {
	public static void main(String[] args) throws IOException {
		try {
			for (int i = 0; i < 1; i++) {
				Thread thread = new Thread(() -> {
					Socket socket = null;
					try {
						socket = new Socket("127.0.0.1", 10101);
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter printWriter = new PrintWriter(outputStream);
						printWriter.write("666");
						printWriter.flush();
						Scanner scanner = new Scanner(System.in);
						while (true) {
							System.out.println("输入消息");
							System.out.println(scanner.nextLine());
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				thread.start();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
