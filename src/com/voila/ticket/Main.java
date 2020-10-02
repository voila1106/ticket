import java.util.*;
import java.io.*;
import java.net.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			//URL u=new URL("https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2020-09-30&leftTicketDTO.from_station=ZSQ&leftTicketDTO.to_station=XKS&purpose_codes=ADULT");
			URL u=new URL("https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2020-09-30&leftTicketDTO.from_station=ZSQ&leftTicketDTO.to_station=XKS&purpose_codes=ADULT");
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.setRequestMethod("GET");
			//con.setDoOutput(true);
			
			con.setRequestProperty("User-Agent",
								   "Mozilla/5.0 (Linux; Android 10; Redmi K30 Pro Build/QKQ1.191117.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/81.0.4044.138 Mobile Safari/537.36");
			
			con.setRequestProperty("Accept", "*/*");
			con.setRequestProperty("Cookie","_uab_collina=160121072665543445013437; JSESSIONID=4ADA757EE94E6011E3EB289D79685B19; BIGipServerotn=568852746.64545.0000; RAIL_EXPIRATION=1601495188161; RAIL_DEVICEID=HNq4GCMHqvyXtd57m_fUCosqw8oP47hcxcR9RwQzMrjdKe1tXn7ItZZu4MS4jdytfSafsJXgCEnd_qBbwLKGQyCTQG5J3p0dHLgYy-wYHEL8Wzf81mJ7PvRu3aAaIyQZ0_U2hrPShZH7ETjxMr7Hg1eBysmxSfLF; BIGipServerpassport=887619850.50215.0000; route=6f50b51faa11b987e576cdb301e545c4; searchHistory=%5B%7B%22innerText%22%3A%22D942%22%7D%2C%7B%22innerText%22%3A%22D942%22%7D%2C%7B%22innerText%22%3A%22D942%22%2C%22url%22%3A%22https%3A//kyfw.12306.cn/otn/queryTrainInfo/init%3Ftrain_no%3D24000000D122%26station_train_code%3DD1%26date%3D2020-09-27%22%7D%5D; _jc_save_fromStation=%u4E2D%u5C71%2CZSQ; _jc_save_toStation=%u53A6%u95E8%u5317%2CXKS; _jc_save_toDate=2020-09-27; _jc_save_wfdc_flag=dc; _jc_save_fromDate=2020-09-30; BIGipServerportal=3084124426.16671.0000");
			BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
			String line=null;
			StringBuilder sb=new StringBuilder();
			while((line=br.readLine())!=null)
			{
				sb.append(line).append("\n");
			}
			//System.out.println(sb.toString());
			con.disconnect();
			br.close();
			String[] data=sb.toString().split("\\|");
			System.out.println("二等座："+data[30]);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
