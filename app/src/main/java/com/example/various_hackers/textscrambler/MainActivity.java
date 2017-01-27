package com.example.various_hackers.textscrambler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    String CIPHER_ALPHABET = "zebrascdfghijklmnopqtuvwxy";
    EditText input_text;
    Button translate_b;
    ImageButton reverse_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_text = (EditText) findViewById(R.id.editText);
        translate_b = (Button) findViewById(R.id.button);
        reverse_b = (ImageButton) findViewById(R.id.imageButton);

        reverse_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Made some changes
            }
        });
    }

    // Use this function to change from encyrpt to decrypt
    // Look at the image in the drawable folder named: "swap_example_not_for_project_usage"
    // for more clarity on how the ui should change if unsure what to do here.
    public void swap_direction() {

    }

    //Use these functions to implement a substitution cipher (https://en.wikipedia.org/wiki/Substitution_cipher)
    //Optional Substitutional Cipher, but you can use your own.
    //  plain text: ABCDEFGHIJKLMNOPQRSTUVWXYZ
    // cipher text: ZEBRASCDFGHIJKLMNOPQTUVWXY
    // example: "flee at once. we are discovered!" transforms into "SIAA ZQ LKBA. VA ZOA RFPBLUAOAR!"
    public String encrypt1(String plainText) {
        char[] decrypted_list = new char[plainText.length()];
        for(int i = 0; i < plainText.length(); i++)
        {
            char plain_char = plainText.charAt(i);

            boolean uppercase_flag = false;
            if ( Character.isUpperCase(plain_char) )
            {
                uppercase_flag = true;
            }
            int index = this.ALPHABET.indexOf(Character.toLowerCase(plain_char));
            char encrypt_char = this.CIPHER_ALPHABET.charAt(index);

            if ( uppercase_flag )
            {
                encrypt_char = Character.toUpperCase(encrypt_char);
            }
            decrypted_list[i] = encrypt_char;
        }
        return new String(decrypted_list);
    }

    public String decrypt1(String encryptedText) {
        char[] decrypted_list = new char[encryptedText.length()];
        for(int i = 0; i < encryptedText.length(); i++) {
            char encrypted_char = encryptedText.charAt(i);

            boolean uppercase_flag = false;
            if ( Character.isUpperCase(encrypted_char) ) {
                uppercase_flag = true;
            }
            int index = this.CIPHER_ALPHABET.indexOf(Character.toLowerCase(encrypted_char));
            char decrypt_char = this.ALPHABET.charAt(index);

            if ( uppercase_flag ) {
                decrypt_char = Character.toUpperCase(decrypt_char);
            }
            decrypted_list[i] = decrypt_char;
        }
        return new String(decrypted_list);
    }

    //Use these functions to implement a polyalphabetic cipher (https://en.wikipedia.org/wiki/Polyalphabetic_cipher)
    //This is similar to substitution but using multiple substitution alphabets
    //              plain text: ABCDEFGHIJKLMNOPQRSTUVWXYZ
    // even letter cipher text: ZEBRASCDFGHIJKLMNOPQTUVWXY
    //  odd letter cipher text: CDFGHIJKLMNOPQTUVWXYZEBRAS
    // example: "test" transforms into "yaxo"
    public void encrypt2() {

    }
    public void decrypt2() {

    }

    //Implement your own encryption
    //This doesn't have to be complicated, but for those who are interested in security
    //and want try something more advanced you could try creating AES encryption (https://en.wikipedia.org/wiki/Advanced_Encryption_Standard)
    // which is the standard worldwide. You can also take a look at some of java and android's built-in encryption libraries for more ideas
    //Here is a link to the android developer docs: https://developer.android.com/reference/javax/crypto/package-summary.html
    public void encrypt3() {

    }
    public void decrypt3() {

    }
}
