/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.kaszkowiak.jdfm.mocks;

/**
 *
 * @author Krzysztof
 */
public class DfmMockStringFactory {
    
    public static String getDfmStringCorrect() {
        return  "object Form2: TForm2\n" +
                    "  Left = 357\n" +
                    "  Top = 239\n" +
                    "  BorderStyle = bsDialog\n" +
                    "  Caption = 'O programie'\n" +
                    "  ClientHeight = 183\n" +
                    "  ClientWidth = 294\n" +
                    "  Color = clBtnFace\n" +
                    "  Font.Charset = DEFAULT_CHARSET\n" +
                    "  Font.Color = clWindowText\n" +
                    "  Font.Height = -11\n" +
                    "  Font.Name = 'MS Sans Serif'\n" +
                    "  Font.Style = []\n" +
                    "  OldCreateOrder = False\n" +
                    "  PixelsPerInch = 96\n" +
                    "  TextHeight = 13\n" +
                    "  object Panel1: TPanel\n" +
                    "    Left = 14\n" +
                    "    Top = 8\n" +
                    "    Width = 275\n" +
                    "    Height = 129\n" +
                    "    BevelOuter = bvLowered\n" +
                    "    TabOrder = 0\n" +
                    "    object Label1: TLabel\n" +
                    "      Left = 98\n" +
                    "      Top = 24\n" +
                    "      Width = 78\n" +
                    "      Height = 27\n" +
                    "      Caption = 'Notatnik+'\n" +
                    "      Font.Charset = EASTEUROPE_CHARSET\n" +
                    "      Font.Color = clWindowText\n" +
                    "      Font.Height = -23\n" +
                    "      Font.Name = 'Arial Narrow'\n" +
                    "      Font.Style = []\n" +
                    "      ParentFont = False\n" +
                    "    end\n" +
                    "    object Label4: TLabel\n" +
                    "      Left = 79\n" +
                    "      Top = 80\n" +
                    "      Width = 25\n" +
                    "      Height = 13\n" +
                    "      Caption = 'Autor'\n" +
                    "    end\n" +
                    "    object Label5: TLabel\n" +
                    "      Left = 98\n" +
                    "      Top = 96\n" +
                    "      Width = 79\n" +
                    "      Height = 16\n" +
                    "      Caption = 'Pawe'#322' G'#243'rski'\n" +
                    "      Font.Charset = DEFAULT_CHARSET\n" +
                    "      Font.Color = clWindowText\n" +
                    "      Font.Height = -13\n" +
                    "      Font.Name = 'MS Sans Serif'\n" +
                    "      Font.Style = []\n" +
                    "      ParentFont = False\n" +
                    "    end\n" +
                    "  end\n" +
                    "  object Button1: TButton\n" +
                    "    Left = 87\n" +
                    "    Top = 144\n" +
                    "    Width = 121\n" +
                    "    Height = 30\n" +
                    "    Caption = 'OK'\n" +
                    "    Default = True\n" +
                    "    TabOrder = 1\n" +
                    "    OnClick = Button1Click\n" +
                    "  end\n" +
                    "end";
    }
    
    public static String getDfmStringCorrectLongProps() {
        return  "object Form1: TForm1\n" +
                "  Left = 327\n" +
                "  Top = 179\n" +
                "  Width = 578\n" +
                "  Height = 531\n" +
                "  Caption = 'ImageComposer'\n" +
                "  Color = clBtnFace\n" +
                "  Font.Charset = DEFAULT_CHARSET\n" +
                "  Font.Color = clWindowText\n" +
                "  Font.Height = -11\n" +
                "  Font.Name = 'MS Sans Serif'\n" +
                "  Font.Style = []\n" +
                "  OldCreateOrder = False\n" +
                "  DesignSize = (\n" +
                "    562\n" +
                "    493)\n" +
                "  PixelsPerInch = 96\n" +
                "  TextHeight = 13\n" +
                "  object PageControl1: TPageControl\n" +
                "    Left = 0\n" +
                "    Top = 0\n" +
                "    Width = 562\n" +
                "    Height = 453\n" +
                "    ActivePage = TabSheet1\n" +
                "    Anchors = [akLeft, akTop, akRight, akBottom]\n" +
                "    HotTrack = True\n" +
                "    MultiLine = True\n" +
                "    TabIndex = 0\n" +
                "    TabOrder = 0\n" +
                "    TabPosition = tpBottom\n" +
                "    object TabSheet1: TTabSheet\n" +
                "      Caption = 'Miniatury'\n" +
                "      DesignSize = (\n" +
                "        554\n" +
                "        427)\n" +
                "      object lblWczytanychObrazow: TLabel\n" +
                "        Left = 176\n" +
                "        Top = 137\n" +
                "        Width = 114\n" +
                "        Height = 13\n" +
                "        Caption = 'Wczytanych obrazow: 0'\n" +
                "      end\n" +
                "      object lbl2: TLabel\n" +
                "        Left = 16\n" +
                "        Top = 8\n" +
                "        Width = 99\n" +
                "        Height = 13\n" +
                "        Caption = 'Miniatury do obliczen'\n" +
                "      end\n" +
                "      object lbl3: TLabel\n" +
                "        Left = 16\n" +
                "        Top = 64\n" +
                "        Width = 153\n" +
                "        Height = 13\n" +
                "        Caption = 'Miniatury do obrazu docelowego'\n" +
                "      end\n" +
                "      object Button2: TButton\n" +
                "        Left = 490\n" +
                "        Top = 30\n" +
                "        Width = 41\n" +
                "        Height = 25\n" +
                "        Anchors = [akTop, akRight]\n" +
                "        Caption = '...'\n" +
                "        TabOrder = 0\n" +
                "        OnClick = Button2Click\n" +
                "      end\n" +
                "      object Button3: TButton\n" +
                "        Left = 16\n" +
                "        Top = 131\n" +
                "        Width = 153\n" +
                "        Height = 25\n" +
                "        Caption = 'Wczytaj obrazy'\n" +
                "        TabOrder = 1\n" +
                "        OnClick = Button3Click\n" +
                "      end\n" +
                "      object edt1: TEdit\n" +
                "        Left = 32\n" +
                "        Top = 32\n" +
                "        Width = 451\n" +
                "        Height = 21\n" +
                "        Anchors = [akLeft, akTop, akRight]\n" +
                "        TabOrder = 2\n" +
                "        Text = 'D:\\baza imagecomposer\\20x15 bmp'\n" +
                "      end\n" +
                "      object edt2: TEdit\n" +
                "        Left = 32\n" +
                "        Top = 88\n" +
                "        Width = 451\n" +
                "        Height = 21\n" +
                "        Anchors = [akLeft, akTop, akRight]\n" +
                "        TabOrder = 3\n" +
                "        Text = 'D:\\baza imagecomposer\\100x75 bmp'\n" +
                "      end\n" +
                "      object btn1: TButton\n" +
                "        Left = 490\n" +
                "        Top = 86\n" +
                "        Width = 41\n" +
                "        Height = 25\n" +
                "        Anchors = [akTop, akRight]\n" +
                "        Caption = '...'\n" +
                "        TabOrder = 4\n" +
                "        OnClick = btn1Click\n" +
                "      end\n" +
                "    end\n" +
                "    object TabSheet2: TTabSheet\n" +
                "      Caption = 'Obraz bazowy'\n" +
                "      ImageIndex = 1\n" +
                "      DesignSize = (\n" +
                "        554\n" +
                "        427)\n" +
                "      object lbl5: TLabel\n" +
                "        Left = 144\n" +
                "        Top = 406\n" +
                "        Width = 227\n" +
                "        Height = 13\n" +
                "        Anchors = [akLeft, akBottom]\n" +
                "        Caption = 'Obraz wyj'#347'ciowy b'#281'dzie sk'#322'ada'#322' si'#281' z  0 miniatur'\n" +
                "        Visible = False\n" +
                "      end\n" +
                "      object scrlbx1: TScrollBox\n" +
                "        Left = 0\n" +
                "        Top = 0\n" +
                "        Width = 554\n" +
                "        Height = 396\n" +
                "        HorzScrollBar.Smooth = True\n" +
                "        HorzScrollBar.Style = ssFlat\n" +
                "        HorzScrollBar.Tracking = True\n" +
                "        VertScrollBar.Smooth = True\n" +
                "        VertScrollBar.Style = ssFlat\n" +
                "        VertScrollBar.Tracking = True\n" +
                "        Anchors = [akLeft, akTop, akRight, akBottom]\n" +
                "        TabOrder = 0\n" +
                "        object img2: TImage\n" +
                "          Left = 0\n" +
                "          Top = 0\n" +
                "          Width = 415\n" +
                "          Height = 271\n" +
                "          AutoSize = True\n" +
                "        end\n" +
                "      end\n" +
                "      object btnLadujObrazWejsciowy: TButton\n" +
                "        Left = 8\n" +
                "        Top = 400\n" +
                "        Width = 129\n" +
                "        Height = 25\n" +
                "        Anchors = [akLeft, akBottom]\n" +
                "        Caption = 'Zaladuj obrazek'\n" +
                "        TabOrder = 1\n" +
                "        OnClick = btnLadujObrazWejsciowyClick\n" +
                "      end\n" +
                "    end\n" +
                "    object TabSheet3: TTabSheet\n" +
                "      Caption = 'Obraz wyjsciowy'\n" +
                "      ImageIndex = 2\n" +
                "      DesignSize = (\n" +
                "        554\n" +
                "        427)\n" +
                "      object grp1: TGroupBox\n" +
                "        Left = 8\n" +
                "        Top = 192\n" +
                "        Width = 360\n" +
                "        Height = 97\n" +
                "        Anchors = [akLeft, akTop, akRight]\n" +
                "        Caption = 'Obliczanie bledu'\n" +
                "        TabOrder = 0\n" +
                "        DesignSize = (\n" +
                "          360\n" +
                "          97)\n" +
                "        object lbl8: TLabel\n" +
                "          Left = 16\n" +
                "          Top = 24\n" +
                "          Width = 8\n" +
                "          Height = 13\n" +
                "          Caption = 'R'\n" +
                "        end\n" +
                "        object lbl9: TLabel\n" +
                "          Left = 16\n" +
                "          Top = 48\n" +
                "          Width = 8\n" +
                "          Height = 13\n" +
                "          Caption = 'G'\n" +
                "        end\n" +
                "        object lbl10: TLabel\n" +
                "          Left = 16\n" +
                "          Top = 72\n" +
                "          Width = 7\n" +
                "          Height = 13\n" +
                "          Caption = 'B'\n" +
                "        end\n" +
                "        object edtR: TEdit\n" +
                "          Left = 32\n" +
                "          Top = 20\n" +
                "          Width = 200\n" +
                "          Height = 21\n" +
                "          Anchors = [akLeft, akTop, akRight]\n" +
                "          TabOrder = 0\n" +
                "          Text = '0,257'\n" +
                "        end\n" +
                "        object edtG: TEdit\n" +
                "          Left = 32\n" +
                "          Top = 44\n" +
                "          Width = 200\n" +
                "          Height = 21\n" +
                "          Anchors = [akLeft, akTop, akRight]\n" +
                "          TabOrder = 1\n" +
                "          Text = '0,504'\n" +
                "        end\n" +
                "        object edtB: TEdit\n" +
                "          Left = 32\n" +
                "          Top = 68\n" +
                "          Width = 200\n" +
                "          Height = 21\n" +
                "          Anchors = [akLeft, akTop, akRight]\n" +
                "          TabOrder = 2\n" +
                "          Text = '0,098'\n" +
                "        end\n" +
                "        object btn2: TButton\n" +
                "          Left = 263\n" +
                "          Top = 24\n" +
                "          Width = 75\n" +
                "          Height = 25\n" +
                "          Anchors = [akTop, akRight]\n" +
                "          Caption = 'RGB'\n" +
                "          TabOrder = 3\n" +
                "          OnClick = btn2Click\n" +
                "        end\n" +
                "        object btnY: TButton\n" +
                "          Left = 263\n" +
                "          Top = 56\n" +
                "          Width = 75\n" +
                "          Height = 25\n" +
                "          Anchors = [akTop, akRight]\n" +
                "          Caption = 'Y (YUV)'\n" +
                "          TabOrder = 4\n" +
                "          OnClick = btnYClick\n" +
                "        end\n" +
                "      end\n" +
                "      object grp2: TGroupBox\n" +
                "        Left = 8\n" +
                "        Top = 8\n" +
                "        Width = 536\n" +
                "        Height = 81\n" +
                "        Anchors = [akLeft, akTop, akRight]\n" +
                "        Caption = 'Liczba mo'#380'liwych wystapien miniatury'\n" +
                "        TabOrder = 1\n" +
                "        DesignSize = (\n" +
                "          536\n" +
                "          81)\n" +
                "        object lbl6: TLabel\n" +
                "          Left = 507\n" +
                "          Top = 24\n" +
                "          Width = 12\n" +
                "          Height = 13\n" +
                "          Anchors = [akRight]\n" +
                "          Caption = '10'\n" +
                "        end\n" +
                "        object trckbr1: TTrackBar\n" +
                "          Left = 8\n" +
                "          Top = 24\n" +
                "          Width = 480\n" +
                "          Height = 45\n" +
                "          Anchors = [akLeft, akTop, akRight]\n" +
                "          Max = 100\n" +
                "          Min = 1\n" +
                "          Orientation = trHorizontal\n" +
                "          Frequency = 1\n" +
                "          Position = 10\n" +
                "          SelEnd = 0\n" +
                "          SelStart = 0\n" +
                "          TabOrder = 0\n" +
                "          TickMarks = tmBottomRight\n" +
                "          TickStyle = tsAuto\n" +
                "          OnChange = trckbr1Change\n" +
                "        end\n" +
                "        object chk1: TCheckBox\n" +
                "          Left = 16\n" +
                "          Top = 56\n" +
                "          Width = 177\n" +
                "          Height = 17\n" +
                "          Caption = 'Mozliwe 1000000 wystapien'\n" +
                "          TabOrder = 1\n" +
                "          OnClick = chk1Click\n" +
                "        end\n" +
                "      end\n" +
                "      object grp3: TGroupBox\n" +
                "        Left = 8\n" +
                "        Top = 96\n" +
                "        Width = 536\n" +
                "        Height = 89\n" +
                "        Anchors = [akLeft, akTop, akRight]\n" +
                "        Caption = 'Minimalna odleg'#322'o'#347#263' pomi'#281'dzy identycznymi miniaturami '\n" +
                "        TabOrder = 2\n" +
                "        DesignSize = (\n" +
                "          536\n" +
                "          89)\n" +
                "        object lbl14: TLabel\n" +
                "          Left = 503\n" +
                "          Top = 24\n" +
                "          Width = 12\n" +
                "          Height = 13\n" +
                "          Anchors = [akTop, akRight]\n" +
                "          Caption = '15'\n" +
                "        end\n" +
                "        object trckbr2: TTrackBar\n" +
                "          Left = 8\n" +
                "          Top = 24\n" +
                "          Width = 480\n" +
                "          Height = 45\n" +
                "          Anchors = [akLeft, akTop, akRight]\n" +
                "          Max = 50\n" +
                "          Min = 1\n" +
                "          Orientation = trHorizontal\n" +
                "          Frequency = 1\n" +
                "          Position = 15\n" +
                "          SelEnd = 0\n" +
                "          SelStart = 0\n" +
                "          TabOrder = 0\n" +
                "          TickMarks = tmBottomRight\n" +
                "          TickStyle = tsAuto\n" +
                "          OnChange = trckbr2Change\n" +
                "        end\n" +
                "      end\n" +
                "    end\n" +
                "    object ts1: TTabSheet\n" +
                "      Caption = 'Post'#281'p'\n" +
                "      ImageIndex = 4\n" +
                "      DesignSize = (\n" +
                "        554\n" +
                "        427)\n" +
                "      object lbl1: TLabel\n" +
                "        Left = 0\n" +
                "        Top = 383\n" +
                "        Width = 33\n" +
                "        Height = 13\n" +
                "        Anchors = [akLeft, akBottom]\n" +
                "        Caption = 'Post'#281'p'\n" +
                "      end\n" +
                "      object lbl4: TLabel\n" +
                "        Left = 514\n" +
                "        Top = 401\n" +
                "        Width = 23\n" +
                "        Height = 13\n" +
                "        Alignment = taRightJustify\n" +
                "        Anchors = [akRight, akBottom]\n" +
                "        Caption = '0 / 0'\n" +
                "      end\n" +
                "      object pb1: TProgressBar\n" +
                "        Left = 0\n" +
                "        Top = 399\n" +
                "        Width = 440\n" +
                "        Height = 17\n" +
                "        Anchors = [akLeft, akRight, akBottom]\n" +
                "        Min = 0\n" +
                "        Max = 100\n" +
                "        TabOrder = 0\n" +
                "      end\n" +
                "      object lst1: TListBox\n" +
                "        Left = 0\n" +
                "        Top = 0\n" +
                "        Width = 553\n" +
                "        Height = 348\n" +
                "        Anchors = [akLeft, akTop, akRight, akBottom]\n" +
                "        ItemHeight = 13\n" +
                "        MultiSelect = True\n" +
                "        TabOrder = 1\n" +
                "      end\n" +
                "      object btnClearLog: TButton\n" +
                "        Left = 455\n" +
                "        Top = 351\n" +
                "        Width = 98\n" +
                "        Height = 25\n" +
                "        Anchors = [akRight, akBottom]\n" +
                "        Caption = 'Wyczysc log'\n" +
                "        TabOrder = 2\n" +
                "        OnClick = btnClearLogClick\n" +
                "      end\n" +
                "    end\n" +
                "    object TabSheet4: TTabSheet\n" +
                "      Caption = 'O programie'\n" +
                "      ImageIndex = 3\n" +
                "      object pnl1: TPanel\n" +
                "        Left = 41\n" +
                "        Top = 37\n" +
                "        Width = 345\n" +
                "        Height = 193\n" +
                "        BevelOuter = bvLowered\n" +
                "        TabOrder = 0\n" +
                "        object lbl7: TLabel\n" +
                "          Left = 87\n" +
                "          Top = 50\n" +
                "          Width = 171\n" +
                "          Height = 26\n" +
                "          Caption = 'ImageComposer'\n" +
                "          Font.Charset = EASTEUROPE_CHARSET\n" +
                "          Font.Color = clWindowText\n" +
                "          Font.Height = -23\n" +
                "          Font.Name = 'DejaVu Serif Condensed'\n" +
                "          Font.Style = []\n" +
                "          ParentFont = False\n" +
                "        end\n" +
                "        object lbl11: TLabel\n" +
                "          Left = 16\n" +
                "          Top = 96\n" +
                "          Width = 31\n" +
                "          Height = 13\n" +
                "          Caption = 'Autor'\n" +
                "          Font.Charset = DEFAULT_CHARSET\n" +
                "          Font.Color = clWindowText\n" +
                "          Font.Height = -11\n" +
                "          Font.Name = 'MS Sans Serif'\n" +
                "          Font.Style = [fsItalic]\n" +
                "          ParentFont = False\n" +
                "        end\n" +
                "        object lbl12: TLabel\n" +
                "          Left = 32\n" +
                "          Top = 120\n" +
                "          Width = 147\n" +
                "          Height = 16\n" +
                "          Caption = 'Krzysztof Kaszkowiak'\n" +
                "          Font.Charset = DEFAULT_CHARSET\n" +
                "          Font.Color = clWindowText\n" +
                "          Font.Height = -13\n" +
                "          Font.Name = 'MS Sans Serif'\n" +
                "          Font.Style = [fsBold]\n" +
                "          ParentFont = False\n" +
                "        end\n" +
                "        object lbl13: TLabel\n" +
                "          Left = 32\n" +
                "          Top = 140\n" +
                "          Width = 200\n" +
                "          Height = 16\n" +
                "          Caption = 'krzysztof.kaszkowiak@gmail.com'\n" +
                "          Font.Charset = DEFAULT_CHARSET\n" +
                "          Font.Color = clWindowText\n" +
                "          Font.Height = -13\n" +
                "          Font.Name = 'MS Sans Serif'\n" +
                "          Font.Style = []\n" +
                "          ParentFont = False\n" +
                "        end\n" +
                "      end\n" +
                "    end\n" +
                "  end\n" +
                "  object Button1: TButton\n" +
                "    Left = 367\n" +
                "    Top = 460\n" +
                "    Width = 182\n" +
                "    Height = 25\n" +
                "    Anchors = [akRight, akBottom]\n" +
                "    Caption = 'Generuj'\n" +
                "    TabOrder = 1\n" +
                "    OnClick = Button1Click\n" +
                "  end\n" +
                "  object OpenDialog1: TOpenDialog\n" +
                "    Options = [ofHideReadOnly, ofFileMustExist, ofEnableSizing]\n" +
                "    Left = 384\n" +
                "    Top = 192\n" +
                "  end\n" +
                "  object dlgOpenPic1: TOpenPictureDialog\n" +
                "    Filter = 'Bitmaps (*.bmp)|*.bmp'\n" +
                "    Left = 384\n" +
                "    Top = 224\n" +
                "  end\n" +
                "  object dlgSave1: TSavePictureDialog\n" +
                "    DefaultExt = '.bmp'\n" +
                "    Filter = 'Bitmaps (*.bmp)|*.bmp'\n" +
                "    Left = 384\n" +
                "    Top = 160\n" +
                "  end\n" +
                "end";
    }
    
    public static String getDfmStringIncomplete() {
                return  "object Form2: TForm2\n" +
                    "  Left = 357\n" +
                    "  Top = 239\n" +
                    "  BorderStyle = bsDialog\n" +
                    "  Caption = 'O programie'\n" +
                    "  ClientHeight = 183\n" +
                    "  ClientWidth = 294\n" +
                    "  Color = clBtnFace\n" +
                    "  Font.Charset = DEFAULT_CHARSET\n" +
                    "  Font.Color = clWindowText\n" +
                    "  Font.Height = -11\n" +
                    "  Font.Name = 'MS Sans Serif'\n" +
                    "  Font.Style = []\n" +
                    "  OldCreateOrder = False\n" +
                    "  PixelsPerInch = 96\n" +
                    "  TextHeight = 13\n" +
                    "  object Panel1: TPanel\n" +
                    "    Left = 14\n" +
                    "    Top = 8\n" +
                    "    Width = 275\n" +
                    "    Height = 129\n" +
                    "    BevelOuter = bvLowered\n" +
                    "    TabOrder = 0\n" +
                    "    object Label1: TLabel\n" +
                    "      Left = 98\n" +
                    "      Top = 24\n" +
                    "      Width = 78\n" +
                    "      Height = 27\n" +
                    "      Caption = 'Notatnik+'\n" +
                    "      Font.Charset = EASTEUROPE_CHARSET\n" +
                    "      Font.Color = clWindowText\n" +
                    "      Font.Height = -23\n" +
                    "      Font.Name = 'Arial Narrow'\n" +
                    "      Font.Style = []\n" +
                    "      ParentFont = False\n" +
                    "    end\n" +
                    "    object Label4: TLabel\n" +
                    "      Left = 79\n" +
                    "      Top = 80\n" +
                    "      Width = 25\n" +
                    "      Height = 13\n" +
                    "      Caption = 'Autor'\n" +
                    "    end\n" +
                    "    object Label5: TLabel\n" +
                    "      Left = 98\n" +
                    "      Top = 96\n" +
                    "      Width = 79\n" +
                    "      Height = 16\n" +
                    "      Caption = 'Pawe'#322' G'#243'rski'\n" +
                    "      Font.Charset = DEFAULT_CHARSET\n" +
                    "      Font.Color = clWindowText\n" +
                    "      Font.Height = -13\n" +
                    "      Font.Name = 'MS Sans Serif'\n" +
                    "      Font.Style = []\n" +
                    "      ParentFont = False\n" +
                    "    end\n" +
                    "  end\n" +
                    "  object Button1: TButton\n" +
                    "    Left = 87\n" +
                    "    Top = 144\n" +
                    "    Width = 121\n" +
                    "    Height = 30\n" +
                    "    Caption = 'OK'\n" +
                    "    Default = True\n" +
                    "    TabOrder = 1\n" +
                    "    OnClick = Button1Click\n" +
                    "  end";
    }
    
    public static String getDfmStringIncorrectApostrophes() {
        return  "object Form2: TForm2\n" +
                    "  Left = 357\n" +
                    "  Top = 239\n" +
                    "  BorderStyle = bsDialog\n" +
                    "  Caption = 'O programie'\n" +
                    "  ClientHeight = 183\n" +
                    "  ClientWidth = 294\n" +
                    "  Color = clBtnFace\n" +
                    "  Font.Charset = DEFAULT_CHARSET\n" +
                    "  Font.Color = clWindowText\n" +
                    "  Font.Height = -11\n" +
                    "  Font.Name = 'MS Sans Serif'\n" +
                    "  Font.Style = []\n" +
                    "  OldCreateOrder = False\n" +
                    "  PixelsPerInch = 96\n" +
                    "  TextHeight = 13\n" +
                    "  object Panel1: TPanel\n" +
                    "    Left = 14\n" +
                    "    Top = 8\n" +
                    "    Width = 275\n" +
                    "    Height = 129\n" +
                    "    BevelOuter = bvLowered\n" +
                    "    TabOrder = 0\n" +
                    "    object Label1: TLabel\n" +
                    "      Left = 98\n" +
                    "      Top = 24\n" +
                    "      Width = 78\n" +
                    "      Height = 27\n" +
                    "      Caption = 'Notatnik+'\n" +
                    "      Font.Charset = EASTEUROPE_CHARSET\n" +
                    "      Font.Color = clWindowText\n" +
                    "      Font.Height = -23\n" +
                    "      Font.Name = 'Arial Narrow'\n" +
                    "      Font.Style = []\n" +
                    "      ParentFont = False\n" +
                    "    end\n" +
                    "    object Label4: TLabel\n" +
                    "      Left = 79\n" +
                    "      Top = 80\n" +
                    "      Width = 25\n" +
                    "      Height = 13\n" +
                    "      Caption = 'Autor'\n" +
                    "    end\n" +
                    "    object Label5: TLabel\n" +
                    "      Left = 98\n" +
                    "      Top = 96\n" +
                    "      Width = 79\n" +
                    "      Height = 16\n" +
                    "      Caption = 'Pawe'#322'' G'#243'rski'\n" +
                    "      Font.Charset = DEFAULT_CHARSET\n" +
                    "      Font.Color = clWindowText\n" +
                    "      Font.Height = -13\n" +
                    "      Font.Name = 'MS Sans Serif'\n" +
                    "      Font.Style = []\n" +
                    "      ParentFont = False\n" +
                    "    end\n" +
                    "  end\n" +
                    "  object Button1: TButton\n" +
                    "    Left = 87\n" +
                    "    Top = 144\n" +
                    "    Width = 121\n" +
                    "    Height = 30\n" +
                    "    Caption = 'OK'\n" +
                    "    Default = True\n" +
                    "    TabOrder = 1\n" +
                    "    OnClick = Button1Click\n" +
                    "  end\n" +
                    "end";
    }
}
