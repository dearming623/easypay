package cn.ming.lib.easypay;

import com.ming.alipay.config.AMSConfiguration;

/**
 * @author Ming on 2024/4/5 12:30
 * @E-mail t8ming@live.com
 * @link https://github.com/dearming623
 */
public class EasyPay {


    public static String getA(){
        return "from easy pay";
    }

    public static AMSConfiguration getB(){
        AMSConfiguration config = AMSConfiguration.builder()
                .clientId("SANDBOX_5Y08882Y3EDZ03753")
                .privateKey("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCBJO3Tvj7VpW+4vMiaGJet6xUZnP40u6U+4q5kC2W3bsy1vQd6odUE0aqKgJ9G7G+qUdVYwYNsA5Srg1a/AE5u3ZAV75avvxpLPr5zg8+rlGBB+9EWAUysMjrkg13odIqn/fVwrXzoA7TKkUT2/4dYxb7YewV6GSC5Z100Q7DFrVE0AFJmmwDG0i3mmT5zSHSBSLQnCaoZAU8HLEKWVds9Rrb8OE8q297ca25L+po/P5A5k/z2pmXMp4mgslt1rIPvqTbxLMQkMDg4OkOjIjcl8IP2SLK930UM3ML+XrHXs+BdASh81y4hQsJecghQ2QQVHobzHYTQstGe9cNXup2rAgMBAAECggEALv/smfIT1hcmSLpT21j14rK6dB7hmPltkyxWQUywkQh+8elAjo3VA7L2eP+EeABWR0sO9QVAOhA3jA/5gvuuj8SMyp7uXTmUbSwBjfK7onsWaQ0nM/X3HHgPXNi+VXoMeEUBjSdmXN30bwBdc/LdJB6bbRegj6YTdcY7cmjsLZR3SE8P5Llnr3K8tnV/v/SrUe19KTCyW7fdVNqeUmiuGrupaE0/rkumY+XvYIYwMQ4HYoX+clKibUzTHrKgkpOMh1c9+QI5Yf9dypkQ5Y6BFecpHhrnDQLzM/QmdznKOCvRiCl9RgTIl72G45GEv5KW6xh2kZZPUDAo5TRqIpW4UQKBgQDSSgJwzqYZyxxvsyLBh2jxeTNofi8UgiC08bxhIWWeWb+P00NSosZQgGDdK/yS1v1ulchHp6wyofrTRTxsmFJC3tnQaCMUQL5Aqa5mSZpTNcYYOB+aXSUxOk6B0vWYJ2Puj1lxTcFazJkj1JF+z4RtkH8qPGEsceCZxb59Za7fQwKBgQCdN3CFfk/EGgFpOS5xnUTEUNtmL114mCF5My33MQHgvStstlF5us5lzaDaBUgifBoR65uy0KKAMIhHbEhQSeWq+6sC4ncx2wsv6vNsyyu0tQ4FNGi7NrS63avtelyqmXXu0ddFKJoK4XM0ltEso8Jc57KRUTMyNUn3/f7gdk2deQKBgA9VnEXzm8Mnv4QZsQAhyrJJH0mQYgiB0LbBJfaDQ/C/JKvtQOyGuCVopyeZrIpcqRBmVbt765+plivP0a8tkFoV/BYpcd1pNzZp6TDGTz2gHzjm5s8P2cV0NgNbidM1lCDyTRhpDh976fLl7lIr+cEvl0ZSLtfZ2gH8nH5yasUXAoGBAJEIVcswjRFRFEAnugqhlJCuLtgDlezsGuUeK6dAFIVovaiaQGtVw5XyrhKykKsPZVVmzsmU4nPzUaTh5Yv7v92OMWKF3IOnmJhp3Ipem0EnTXnLsVoTy4IfgL2hBd9zlnHsLvTj0cd717WJ9AmEQIdIT1jzWZFVy5j1Pa2ANXWxAoGALoTb3JlHQIhfm0s/WyWlzyyuWm4UFeEzBjo5qBzL49ZOQhAL7y8pFTN1UntXMVq6enS4N0ljaSlUvyRLkgKC1JsQKetS9cOcb2LsAlMklBhMvZUBYSw+cHZcdpHqMZEfT754hXz5Zqa+PXeFC22Af4yG8nlrMKDObwA8M6GayfM=")
                .gatewayUrl("https://open-na.alipay.com")
                .build();
        String agentToken = "zI7ZHWL4PURWs61dpIyckR1i1dZYZdZtKGgmqCemR00000A1";
        long amountInCents = 1000L;
        return config;
    }

}
